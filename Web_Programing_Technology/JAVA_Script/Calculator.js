const display = document.getElementById("display");
let current = "";

function updateDisplay() {
    display.textContent = current || "0";
}

function safeEval(expr) {
    if (!/^[0-9+\-*/().%\s]+$/.test(expr)) return "Error";
    try {
        expr = expr.replace(/(\d+(\.\d+)?)%/g, "($1/100)");
        let val = eval(expr);
        if (typeof val === "number" && isFinite(val)) {
            val = Math.round((val + Number.EPSILON) * 1000000) / 1000000;
            return String(val);
        }
        return "Error";
    } catch {
        return "Error";
    }
}

document.querySelectorAll(".key").forEach(btn => {
    btn.addEventListener("click", () => {
        const val = btn.dataset.value;
        const action = btn.dataset.action;

        if (action === "clear") {
            current = "";
            return updateDisplay();
        }
        if (action === "back") {
            current = current.slice(0, -1);
            return updateDisplay();
        }
        if (action === "calculate") {
            if (!current) return;
            const res = safeEval(current);
            current = res === "Error" ? "" : res;
            return updateDisplay();
        }

        if (val === ".") {
            const parts = current.split(/[\+\-\*\/]/);
            const last = parts[parts.length - 1];
            if (last.includes(".")) return;
        }

        current += val;
        updateDisplay();
    });
});

updateDisplay();
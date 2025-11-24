function loadData() {
    fetch("data.json")              // Fetch the JSON file
        .then(response => response.json())   // Convert to JS object
        .then(data => {
            document.getElementById("result").innerHTML = `
                <h3>Name: ${data.name}</h3>
                <h3>Course: ${data.course}</h3>
                <h3>Year: ${data.year}</h3>
            `;
        })
        .catch(error => console.log("Error:", error));
}

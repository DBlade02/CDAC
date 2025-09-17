# Calculate average of Three Numbers
def sum(a, b, c) :
    add = a + b + c / 3

    return add
 
print(sum(93, 94, 97)) 


# Factorial Number

def fact(n) :
    fact_no = 1
    for i in range(1, n + 1):
        fact_no = fact_no * i

    print(fact_no)

fact(5)

# Currency Converter USD to INR

def currency(yen_val) :
    inr_val = yen_val * 0.6
    print(yen_val, "YEN =", inr_val , "INR")

currency(10000)
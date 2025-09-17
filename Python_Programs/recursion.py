# We have to show numbers from 5 to 1

def show(n) :
    if(n == 0) :
        return
    print(n)
    show(n-1)

show(5)
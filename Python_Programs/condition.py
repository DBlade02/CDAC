name = input("Name : ")
age = int(input("Age : "))

if(age < 18):
    print("Hii", name , "You are not eligible to vote")
elif(age >= 18 and age <= 65):
    print("Hii", name , "You are eligible to vote")    
else:
    print("Your age is too high")    
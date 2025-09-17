doctors = []
num_doctors = int(input("How many Doctor's Do you want to add ? "))

for i in range(num_doctors) :
 name = input("Enter Your Name : ")
 age = int(input("Enter Your Age : "))
 profession = input("Enter Your Profession : ")
 print("")
 print("--------------------------------------------")
 print("")

 doctors.append(name)

print("No of Doctor's Present in the Hospital")
for doc  in doctors :
 print(doc)
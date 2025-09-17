info = {
    "name" : "Aditya",
    "age" : 23,
    "Address" : "India",
    "cgpa" : 7.14,
    "girlfriend" : False,

}
print(info)

print(info["age"])


#------------------------------------------ Nested Dictionary --------------------------------------------------

student = {
    "name" : "Abc",
    "Subjects" : {
        "Phy" : 87,
        "Che" : 45,
        "Bio" : 96
    } 
}

print(student["Subjects"])
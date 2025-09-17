# Tuples are immutable

tup = (1,2,3,3,4,5,)

# Returns the first occurrence of element
print(tup.index(2))

# Returns the count of occuerrence
print(tup.count(3))


# take 3 movies from user and add them in list

movies = []
movie_name1 = input("Movie name 1: ")
movie_name2 = input("Movie name 2: ")
movie_name3 = input("Movie name 3: ")
movies.append(movie_name1)
movies.append(movie_name2)
movies.append(movie_name3)

print(movies)
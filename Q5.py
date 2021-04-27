n=int(input("Enter the number of numbers you want to enter: "))
r=0
for i in range(n):
    num=int(input('Enter the numbers: '))
    r=r*10+num

print(r)

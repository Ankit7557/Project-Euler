t=int(input('Enter the number of triples: '))
for i in range(t):
    p=int(input())
    q=int(input())
    r=int(input())
    list1=[]
    list1.append(p)
    list1.append(q)
    list1.append(r)
    list1.sort()
    print(list1[2])
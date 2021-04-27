
t=int(input())
for i in range(t):
    n=int(input())
    list1=[]
    for j in range(n):
        
        ele=int(input())    
        list1.append(ele)
    print(list1)


x=1

for k in range(len(list1)):
    x=x*list1[k]
print(x) 
l=2
while(l<x):
        if(x%(l**2)==0):
            print(l)
        l+=1
t=int(input())

for i in range(t):
    num=int(input())
    r=1
    while num!=0:
        r*=num
        num-=1
    print(r)

def isPrime(n):

    for i in range(2,n):
        if n%i==0:
            return False
    return True

def printPrime():
    list2=[]
    for i in range(2,100000):
        
        if isPrime(i):
           
            list2.append(i)
    return list2    

if __name__=='__main__':
    t=int(input())
    for i in range(t):
        n=int(input())
        list1=[] 
        list1=printPrime()
        print(list1[n])
        
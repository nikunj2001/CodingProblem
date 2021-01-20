for i in range(int(input())):
    n=int(input())
    size=n-2
    num=size//2
    space=size-num
    c=1
    for i in range(n//2,0,-1):
        for j in range(space,0,-1):
            print(" ",end="")
            c+=1
        space-=1
        for i in range(num):
            print(c,end='')
            c+=1
        c=1
        print()

    space=1
    c=1
    for i in range(1,(n-(n//2)+1)):
        for j in range(1,space):
            print(" ",end="")
            c+=1
        space+=1
        for i in range(num):
            print(c,end='')
            c+=1
        c=1
        print()






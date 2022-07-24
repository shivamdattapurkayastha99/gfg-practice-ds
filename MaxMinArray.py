        
def getMinMax( a, n):
    max=1
    min=10**12
    
    for i in range(0,n):
        if a[i]>max:
            max=a[i]
        if a[i]<min:
            min=a[i]
    
    return (min,max)
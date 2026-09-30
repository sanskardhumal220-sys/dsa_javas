# # reverse a number
# n = int(input("Enter a number: "))
# rev = 0

# while n != 0:
#     digit = n % 10
#     rev = rev * 10 + digit
#     n = n // 10

# print(rev)

# n=int(input("enter the no : "))
# original = n
# rev= 0
# while n != 0:
#      digit = n % 10
#      rev = rev * 10 + digit
#      n = n // 10
# if(original==rev):
#         print("pendrilome")
# else:
#     print("not penlidrome")

# n=int(input("enter the no : "))

# count=0
# while n>0:
#     digit= n % 10
#     if(digit==7):
#         count+=1
#     n = n//10
# print(count)

# n=int(input("enter the no : "))
# evencount=0
# oddcount=0
# while n>0:
#     digit= n % 10
#     if(digit%2==0):
#          evencount+=1
#     else:
#         oddcount+=1
#     n=n//10
# print(evencount)
# print(oddcount)       

# Q3. Find the Largest Digit
# Problem
# Given a positive integer N, find the largest digit present in the number.


# Example

# Input
# 58329

# Output
# 9
n=int(input("enter the no : "))

largest = 0
while n>0:
    digit = n % 10
    if(digit>largest):
        largest=digit
    n=n//10
print(largest)
        

    

 

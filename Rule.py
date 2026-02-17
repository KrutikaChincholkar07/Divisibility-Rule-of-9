num = int(input("Enter a number: "))
temp = num
digit_sum = 0

while temp > 0:
    digit_sum += temp % 10
    temp //= 10

if digit_sum % 9 == 0:
    print(num, "is divisible by 9")
else:
    print(num, "is not divisible by 9")

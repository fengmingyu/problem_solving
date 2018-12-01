def persistence(n):
    count = 0
    while n // 10 > 0:
        n = digitMultiply(n)
        count += 1
    return count

def digitMultiply(n):
    digits = 1
    while n != 0:
        digits *= n % 10
        n = n // 10
    return digits

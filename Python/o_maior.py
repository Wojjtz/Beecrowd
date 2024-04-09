valores = input().split()
a = int(valores[0])
b = int(valores[1])
c = int(valores[2])
maiorAB = (a + b + abs(a - b))/2
if maiorAB > c:
    print(f"{int(maiorAB)} eh o maior")
else:
    print(f"{int(c)} eh o maior")
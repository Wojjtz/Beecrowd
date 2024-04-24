quantidade_titas, tamanho_muralha = map(int, input().split())
titas = input()
p, m, g = map(int, input().split())

muralha = 0
quantidade_muralhas = 0

for t in titas:
    if muralha == 0 or muralha < p:
        muralha = tamanho_muralha
        quantidade_muralhas += 1

    if t == "P":
        muralha -= p
    elif t == "M":
        muralha -= m
    else:
        muralha -= g

print(quantidade_muralhas)
    
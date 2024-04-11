def adicionar_um(v1, posicao):
    if posicao + len(v1) < 0:
        return
    
    v1[posicao] = v1[posicao] + 1
    
while True:
    valor1, valor2 = map(str, input().split())

    if valor1 == "0" and valor2 == "0":
        break
    
    v1 = [int(n) for n in valor1]
    v2 = [int(n) for n in valor2]

    if(len(v1) > len(v2)):
        for n in range(len(v1) - len(v2)):
            v2.insert(0,0)
    else:
        for n in range(len(v2) - len(v1)):
            v1.insert(0,0)

    posicao, carrys = -1, 0
    while posicao + len(v1) != -1:
        if v1[posicao] + v2[posicao] >= 10:
            adicionar_um(v1, posicao-1)
            posicao -= 1
            carrys += 1
        else:
            posicao -= 1
    
    if carrys == 0:
        print("No carry operation.")
    elif carrys == 1:
        print("1 carry operation.")
    else:
        print(f"{carrys} carry operations.")
vezes = int(input())
for _ in range(vezes):
    diamantes = 0
    mina = list(input())

    for ponto in range(mina.count(".")):
        mina.remove(".")

    sinais_restantes = 0
    for sinal in mina:
        if sinal == "<":
            sinais_restantes += 1
        elif sinal == ">" and sinais_restantes > 0:
            diamantes += 1
            sinais_restantes -= 1
    print(diamantes)
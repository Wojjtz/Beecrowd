while True:
    numero_de_cartas = int(input())
    
    if numero_de_cartas == 0:
        break

    baralho = []

    for carta in range(1,numero_de_cartas+1):
        baralho.append(carta)

    cartas_descartadas = []
    while True:
        if len(baralho) == 1:
            break

        cartas_descartadas.append(baralho[0])
        baralho.remove(baralho[0]) 
        carta_base = baralho[0] 
        baralho.remove(baralho[0])  
        baralho.append(carta_base) 

    print("Discarded cards: " + ", ".join(map(str,cartas_descartadas)))
    print("Remaining card: " + "".join(map(str,baralho)))
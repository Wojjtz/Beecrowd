while True:
    try:
        guerreiros = input().split(" ")

        guerreiros_hashmat = int(guerreiros[0])
        inimigos = int(guerreiros[1])

        print(abs(guerreiros_hashmat - inimigos))
    except:
        break
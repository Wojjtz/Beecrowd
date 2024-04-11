import math

pi = 3.1415926535897

while True:
    try:
        valores = input()
        if valores == "":
            break
    
        valores = valores.split(" ")
        cat_op = int(valores[0])
        cat_ad = int(valores[1])
        hip = int(valores[2])

        # metade do perimetro do triangulo
        p = (cat_op + cat_ad + hip) / 2

        area_triangulo = math.sqrt(p * (p - cat_op) * (p - cat_ad) * (p - hip))
        raio_menor = area_triangulo / p
        raio_maior = (cat_op * cat_ad * hip) / (4 * area_triangulo)

        area_circulo_maior = pi * (raio_maior**2)
        area_circulo_menor = pi * (raio_menor**2)

        area_girassois = area_circulo_maior - area_triangulo
        area_violetas = area_triangulo - area_circulo_menor
        area_rosas = area_circulo_menor

        print(f"{area_girassois:.4f} {area_violetas:.4f} {area_rosas:.4f}")
    except:
        break
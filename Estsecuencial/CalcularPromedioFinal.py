print("Calcular Promedio final FP")
#Datos de entrada
nota1=float(input("Ingrese nota de evaluacion 1:"))
nota2=float(input("Ingrese nota de evaluacion 2:"))
nota3=float(input("Ingrese nota de evaluacion 3:"))
nota4=float(input("Ingrese nota de evaluacion 4:"))
nota5=float(input("Ingrese nota de evaluacion 5:"))
nota6=float(input("Ingrese nota de evaluacion 6:"))
nota7=float(input("Ingrese nota de evaluacion 7:"))
#Proceso
profin=(0.15*nota1)+(0.15*nota2)+(0.10*nota3)+(0.15*nota4)+(0.05*nota5)+(0.10*nota6)+(0.30*nota7)
#Datos de salida
print("El promedio final es:", round(profin,2))
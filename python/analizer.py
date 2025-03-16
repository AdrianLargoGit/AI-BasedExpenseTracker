import sys
import joblib  # Para cargar modelos de IA

model = joblib.load("gastos_model.pkl")

# Simulación de clasificación automática
def clasificar_gasto(descripcion):
    categorias = ["Comida", "Transporte", "Entretenimiento", "Salud", "Educación"]
    return categorias[hash(descripcion) % len(categorias)]

if __name__ == "__main__":
    descripcion = sys.argv[1]
    print(clasificar_gasto(descripcion))  # Devuelve la categoría

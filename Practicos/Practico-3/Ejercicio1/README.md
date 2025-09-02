# Sistema de Gestión de Pedidos – Pizzería 🍕 (Java)

Organiza los pedidos de una pizzería aplicando **Inserción**, **Shellsort** y **Quicksort** según distintos criterios operativos:  
- **Tiempo de preparación** → Inserción  
- **Precio total** → Shellsort  
- **Nombre del cliente** → Quicksort

> Este README sigue fielmente los requerimientos del práctico y la estructura propuesta.

---

## 🎯 Objetivo

Desarrollar un sistema sencillo y didáctico que:
1. Gestione una lista de pedidos (alta, baja, modificación).
2. Ordene los pedidos con tres algoritmos distintos, cada uno asociado a un criterio.
3. Mida tiempos de ejecución con diferentes tamaños de entrada (p. ej. 100, 1000 y 10000).

---

## 🧩 Estructura del proyecto

```
/gestion-pizzeria
│
├── /src
│   ├── Main.java                  # Punto de entrada (menú CLI)
│   ├── Pedido.java                # Entidad del dominio
│   ├── Pizzeria.java              # Gestión de pedidos (CRUD)
│   ├── Ordenador.java             # Algoritmos de ordenamiento
│   └── TiempoOrdenamiento.java    # Utilidad para medir tiempos
│
└── README.md
```

---

## 🗃️ Modelo de datos

**Pedido**
- `String id` (opcional, para identificar)
- `String nombreCliente`
- `double precioTotal`
- `int tiempoPreparacion` (minutos)
- `LocalDateTime fechaHora` (opcional)

> Campos mínimos necesarios para cumplir los criterios: `nombreCliente`, `precioTotal`, `tiempoPreparacion`.

---

## ✨ Funcionalidades

1. **Gestión de pedidos**
   - Agregar / Eliminar
   - Actualizar (tiempo de preparación, precio total, nombre del cliente)

2. **Ordenamiento**
   - **Inserción** por tiempo de preparación (ascendente)
   - **Shellsort** por precio total (ascendente)
   - **Quicksort** por nombre de cliente (A→Z)

3. **Medición de tiempos**
   - Captura de tiempos para diferentes tamaños de lista (p. ej. 100, 1000, 10000)
   - Múltiples corridas para promediar (opcional)

---

## ▶️ Ejecución rápida

### Requisitos
- Java 17+ (recomendado)

### Compilar y ejecutar (sin build tool)
```bash
javac -d out src/*.java
java -cp out Main
```

*(Si usas Maven/Gradle, puedes integrar estas clases en un proyecto estándar.)*

---

## 🖥️ Uso (interfaz por consola)

Menú sugerido en `Main`:

```
1) Agregar pedido
2) Eliminar pedido
3) Actualizar pedido
4) Listar pedidos
5) Ordenar por tiempo (Inserción)
6) Ordenar por precio (Shellsort)
7) Ordenar por nombre (Quicksort)
8) Medir tiempos (100 / 1000 / 10000)
0) Salir
```

---

## 🔧 Implementación de algoritmos

### Inserción (tiempo de preparación)
```java
public static void insercionPorTiempo(List<Pedido> xs) {
    for (int i = 1; i < xs.size(); i++) {
        Pedido key = xs.get(i);
        int j = i - 1;
        while (j >= 0 && xs.get(j).getTiempoPreparacion() > key.getTiempoPreparacion()) {
            xs.set(j + 1, xs.get(j));
            j--;
        }
        xs.set(j + 1, key);
    }
}
```

### Shellsort (precio total)
```java
public static void shellsortPorPrecio(List<Pedido> xs) {
    for (int gap = xs.size()/2; gap > 0; gap /= 2) {
        for (int i = gap; i < xs.size(); i++) {
            Pedido temp = xs.get(i);
            int j = i;
            while (j >= gap && xs.get(j-gap).getPrecioTotal() > temp.getPrecioTotal()) {
                xs.set(j, xs.get(j-gap));
                j -= gap;
            }
            xs.set(j, temp);
        }
    }
}
```

### Quicksort (nombre del cliente)
```java
public static void quicksortPorNombre(List<Pedido> xs) {
    quick(xs, 0, xs.size()-1);
}

private static void quick(List<Pedido> xs, int lo, int hi) {
    if (lo >= hi) return;
    int p = particionar(xs, lo, hi);
    quick(xs, lo, p - 1);
    quick(xs, p + 1, hi);
}

private static int particionar(List<Pedido> xs, int lo, int hi) {
    String pivote = xs.get(hi).getNombreCliente();
    int i = lo;
    for (int j = lo; j < hi; j++) {
        if (xs.get(j).getNombreCliente().compareToIgnoreCase(pivote) <= 0) {
            Collections.swap(xs, i, j);
            i++;
        }
    }
    Collections.swap(xs, i, hi);
    return i;
}
```

---

## ⏱️ Medición de tiempos

```java
public final class TiempoOrdenamiento {
    private TiempoOrdenamiento() {}

    public static long medirMillis(Runnable tarea) {
        long t0 = System.nanoTime();
        tarea.run();
        long t1 = System.nanoTime();
        return (t1 - t0) / 1_000_000L;
    }
}
```

Ejemplo:
```java
List<Pedido> datos = generarPedidos(1000);
long tInsercion = TiempoOrdenamiento.medirMillis(() -> Ordenador.insercionPorTiempo(datos));
```

---

## 📊 Complejidad (resumen)

| Algoritmo     | Mejor caso | Promedio          | Peor caso        | Estable |
|---------------|------------|-------------------|------------------|---------|
| Inserción     | O(n)       | O(n²)             | O(n²)            | Sí      |
| Shellsort     | —          | ~O(n^(3/2)) aprox | ~O(n²)           | No      |
| Quicksort     | O(n log n) | O(n log n)        | O(n²)            | No      |

---

## 📌 Roadmap corto

- Exportar resultados de tiempos a CSV.
- Generador de pedidos de prueba.
- Tests unitarios con JUnit.

---

## 📄 Licencia

Uso educativo.

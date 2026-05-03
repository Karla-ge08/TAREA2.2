#include <iostream>
#include <fstream>
#include <string>
#include <iomanip>

using namespace std;

int main() {
    ifstream archivo("productos.txt");

    string nombreProd, prodMayor;
    double precio, subtotal, totalVenta = 0, maxSubtotal = -1;
    int cantidad;

    if (!archivo.is_open()) {
        cout << "--- ERROR: No se puede abrir 'productos.txt' ---" << endl;
        cout << "Asegurate de que el archivo este en la misma carpeta que este codigo." << endl;
        return 1;
    }

    cout << "--- DETALLE DE PRODUCTOS ---" << endl;
    cout << fixed << setprecision(2);

    while (archivo >> nombreProd >> precio >> cantidad) {
        subtotal = precio * cantidad;
        cout << "Producto: " << left << setw(12) << nombreProd
             << " | Subtotal: $" << subtotal << endl;

        totalVenta += subtotal;

        if (subtotal > maxSubtotal) {
            maxSubtotal = subtotal;
            prodMayor = nombreProd;
        }
    }

    cout << "-------------------------------------------" << endl;

    if (totalVenta > 0) {
        cout << "TOTAL GENERAL DE LA VENTA: $" << totalVenta << endl;
        cout << "PRODUCTO CON MAYOR GASTO:  " << prodMayor << " ($" << maxSubtotal << ")" << endl;
    } else {
        cout << "AVISO: El archivo se abrio pero no se procesaron datos." << endl;
    }

    archivo.close();
    return 0;
}

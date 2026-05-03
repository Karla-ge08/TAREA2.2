#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    ifstream archivo("estudiantes.txt");
    string nombre;
    double n1, n2, n3, promedio;
    int total = 0, aprobados = 0;
    double suma = 0;

    if (!archivo.is_open()) return 1;

    while (archivo >> nombre >> n1 >> n2 >> n3) {
        promedio = (n1 + n2 + n3) / 3.0;

        cout << "Nombre: " << nombre << " | Promedio: " << promedio << " | Estado: ";

        if (promedio >= 9) {
            cout << "Excelente" << endl;
            aprobados++;
        } else if (promedio >= 7) {
            cout << "Bueno" << endl;
            aprobados++;
        } else {
            cout << "Reprobado" << endl;
        }

        suma += promedio;
        total++;
    }

    if (total > 0) {
        cout << "-----------------------------------" << endl;
        cout << "Promedio general: " << suma / total << endl;
    }

    archivo.close();
    return 0;
}

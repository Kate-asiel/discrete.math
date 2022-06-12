#include <iostream>
#include <set>
using namespace std;
int main()
{
    int x;

    int arr1[5];
    int arr2[5];
    int size1 = sizeof(arr1) / sizeof(arr1[0]);
    int size2 = sizeof(arr2) / sizeof(arr2[0]);

    cout << "First set: " << endl;
    for (int i = 0; i < size1; i++)
    {
        cin >> x;
        arr1[i] = x;
    }

    cout << "Second set: " << endl;
    for (int j = 0; j < size2; j++)
    {
        cin >> x;
        arr2[j] = x;
    }

    cout << "Cartesian product: " << endl;
    for (int i = 0; i < size1; i++)
        for (int j = 0; j < size2; j++)
            cout << "{" << arr1[i] << "," << arr2[j] << "}" << " ";


    cout << endl;


    cout << "absolute addition: ";
    std::set<int> A{ 1, 3, 5, 7, 9, 11 };
    std::set<int> B{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };


    for (int v : A)
    {
        auto B_it = B.find(v);

        if (B_it != B.end()) B.erase(B_it);
    }


    for (int v : B)
        cout << v << "\t";
    cout << "\n";



    return 0;

}


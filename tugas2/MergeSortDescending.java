public class MergeSortDescending {
    // fungsi utama merge sort
    public static void mergeSort (int[] array, int left, int right) {
     if (left < right) {
      int middle = (left + right) / 2;

      // rekursif bagian kiri dan kanan
      mergeSort(array, left, middle);
      mergeSort(array, middle + 1, right);

      // gabungkan kedua bagian
      merge(array, left, middle, right);
     }
    }

    // fungsi untuk menggabungkan kedua array atau sub array
    public static void merge (int[] array, int left, int middle, int right) {
     int n1 = middle - left + 1;
     int n2 = right - middle;

     // buat array sementara
     int[] leftArray = new int[n1];
     int[] rightArray = new int[n2];

     // salin data ke array sementara
     for (int i = 0; i < n1; i++) 
         leftArray[i] = array[left + i];
     for (int j = 0; j < n2; j++) 
         rightArray[j] = array[middle + 1 + j];
     
    // gabungkan array sementara ke dalam array utama
    int i = 0, j=0;
    int k = left;

    // urutkan seacara menurun 
    while (i < n1 && j < n2) {
        if (leftArray[i] >= rightArray[j]){
            array[k] = leftArray[i];
            i++;
        } else {
            array[k] = rightArray[j];
            j++;
        }
        k++;
    }

    // salin sisa elemen (jika ada)
    while (i < n1) {
        array[k] = leftArray[i];
        i++;
        k++;
    }

    while (j < n2) {
        array[k] = rightArray[j];
        j++;
        k++;
    } 
    }


    // fungsi main untuk eksekusi program
    public static void main(String[] args) {
        int[] data = {20, 21, 26, 22, 34, 50};

        System.out.println("Data sebelum diurutkan: ");
        for(int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(data, 0, data.length - 1);

        System.out.println("Data setelah diurutkan: ");
          for(int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
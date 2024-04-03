import java.util.*;

public class URI1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int k = 0; k < T; ++k){
            int X = scanner.nextInt();

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            Set<Pair<Integer, Integer>> arestas = new HashSet<>();
            for(int i = 0; i < m; ++i){
                int u = scanner.nextInt();
                int v = scanner.nextInt();

                arestas.add(new Pair<>(u, v));
                arestas.add(new Pair<>(v, u));
            }

            System.out.println(arestas.size());
        }
        scanner.close();
    }

    static class Pair<U, V> {
        public U first;
        public V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) &&
                    Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}

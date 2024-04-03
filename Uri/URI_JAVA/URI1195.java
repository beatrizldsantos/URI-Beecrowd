import java.util.*;

class No {
    private int valor;
    public No pai;
    public No esq;
    public No dir;

    public No(int valor, No pai) {
        this.valor = valor;
        this.pai = pai;
        this.esq = null;
        this.dir = null;
    }

    public void adiciona(int valor) {
        if (valor == this.valor) {
            return;
        }
        if (valor < this.valor) {
            if (this.esq == null) {
                this.esq = new No(valor, this);
            } else {
                this.esq.adiciona(valor);
            }
        } else {
            if (this.dir == null) {
                this.dir = new No(valor, this);
            } else {
                this.dir.adiciona(valor);
            }
        }
    }

    public No busca(int valor) {
        if (valor == this.valor) {
            return this;
        } else if (valor < this.valor) {
            if (this.esq == null) {
                return null;
            }
            return this.esq.busca(valor);
        } else {
            if (this.dir == null) {
                return null;
            }
            return this.dir.busca(valor);
        }
    }

    public void remove() {
        if (this.esq == null && this.dir == null) {
            if (this.pai != null) {
                if (this.pai.esq == this) {
                    this.pai.esq = null;
                } else {
                    this.pai.dir = null;
                }
            }
        } else if (this.esq == null || this.dir == null) {
            No filho = (this.esq != null) ? this.esq : this.dir;
            if (this.pai != null) {
                if (this.pai.esq == this) {
                    this.pai.esq = filho;
                } else {
                    this.pai.dir = filho;
                }
            }
        } else {
            No sucessor = this.dir;
            while (sucessor.esq != null) {
                sucessor = sucessor.esq;
            }
            this.valor = sucessor.valor;
            sucessor.remove();
        }
    }

    public void prefixa(StringBuilder sb) {
        sb.append(" " + this.valor);
        if (this.esq != null) {
            this.esq.prefixa(sb);
        }
        if (this.dir != null) {
            this.dir.prefixa(sb);
        }
    }

    public void infixa(StringBuilder sb) {
        if (this.esq != null) {
            this.esq.infixa(sb);
        }
        sb.append(" " + this.valor);
        if (this.dir != null) {
            this.dir.infixa(sb);
        }
    }

    public void posfixa(StringBuilder sb) {
        if (this.esq != null) {
            this.esq.posfixa(sb);
        }
        if (this.dir != null) {
            this.dir.posfixa(sb);
        }
        sb.append(" " + this.valor);
    }
}

class ArvoreBinaria {
    public No topo;

    public ArvoreBinaria() {
        this.topo = null;
    }

    public void adiciona(int valor) {
        if (this.topo == null) {
            this.topo = new No(valor, null);
        } else {
            this.topo.adiciona(valor);
        }
    }

    public boolean busca(int valor) {
        if (this.topo == null) {
            return false;
        }
        return this.topo.busca(valor) != null;
    }

    public void remove(int valor) {
        No no = this.topo.busca(valor);

        if (no != null && no.pai == null) {
            if (no.esq == null && no.dir == null) {
                this.topo = null;
            } else if (no.esq != null || no.dir != null) {
                this.topo = (no.esq != null) ? no.esq : no.dir;
            }
        }
        if (no != null) {
            no.remove();
        }
    }

    public void prefixa(StringBuilder sb) {
        sb.append("Pre.:");
        if (this.topo != null) {
            this.topo.prefixa(sb);
        }
        sb.append("\n");
    }

    public void infixa(StringBuilder sb) {
        sb.append("In..:");
        if (this.topo != null) {
            this.topo.infixa(sb);
        }
        sb.append("\n");
    }

    public void posfixa(StringBuilder sb) {
        sb.append("Post:");
        if (this.topo != null) {
            this.topo.posfixa(sb);
        }
        sb.append("\n");
    }
}

public class URI1195 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int C = scanner.nextInt();

        for (int k = 1; k <= C; ++k) {
            int N = scanner.nextInt();
            List<Integer> v = new ArrayList<>();
            for (int i = 0; i < N; ++i) {
                v.add(scanner.nextInt());
            }

            ArvoreBinaria ab = new ArvoreBinaria();
            for (int i = 0; i < v.size(); ++i) {
                ab.adiciona(v.get(i));
            }

            sb.append("Case ").append(k).append(":\n");
            ab.prefixa(sb);
            ab.infixa(sb);
            ab.posfixa(sb);
            sb.append("\n");
        }

        System.out.print(sb.toString());
        scanner.close();
    }
}

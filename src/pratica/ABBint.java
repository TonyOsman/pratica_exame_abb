package pratica;

public class ABBint {

private class NO {
    int dado;
    NO esq,dir;
    }

    //inicializção da árvore
    public NO root = null;


//Inserir
    public NO inserir(NO p, int info){
        if (p == null) {
            p = new NO();
            p.dado = info;
            p.esq = null;
            p.dir = null;
        } else if (info < p.dado) {
            p.esq = inserir(p.esq,info);
        } else {
            p.dir = inserir(p.dir, info);
        }
        return p;
    }


//Remover
    public NO remover(NO p, int info){
        if(p!=null){
            if (info == p.dado){
                if (p.esq==null && p.dir==null) {
                    return null;
                }if (p.esq==null){
                    return p.dir;
                }else {
                    if (p.dir == null){
                        return p.esq;
                }else{
                        NO aux, ref;
                        ref = p.dir;
                        aux = p.dir;
                        while (aux.esq != null)
                            aux = aux.esq;
                        aux.esq = p.esq;
                        return ref;
                    }
                }
                } else { // procura dado a ser removido na ABB
                    if (info < p.dado)
                        p.esq = remover(p.esq, info);
                    else
                        p.dir = remover(p.dir, info);
                }
            }
            return p;
        }


    //Consultar
    public boolean consulta(NO p, int info){
        if (p==null)
            return false;
        else {
            if (info == p.dado)
                return true;
            else if (info < p.dado) {
                return consulta(p.esq, info);}
            else
                return consulta(p.dir, info);
            }
        }
    }





public class puzzle {

    int[][] puz = new int[3][3];

    public puzzle() {
        int n;
        for(int i = 0; i < puz.length; i++)
            for(int j = 0; j < puz[i].length; j++) {
                n = (int) Math.floor(Math.random() * (10 ));
                while (verificar(n)==true){
                    n = (int) Math.floor(Math.random() * (10));
                }
                puz[i][j] = n;
            }
        for(int i = 0; i < puz.length; i++)
            for (int j = 0; j < puz[i].length; j++)
                puz[i][j]--;
    }

    private boolean verificar(int nume){
        for(int x = 0; x < puz.length; x++) {
            for (int y = 0; y < puz[x].length; y++)
                if (puz[x][y] == nume)
                    return true;
        }
        return false;
    }

    public void mover(int i){
        int[] zero = find();
        int aux;
        switch (i){
            case 1:
                if(zero[0]!=2){
                    puz[zero[0]][zero[1]] = puz[zero[0]+1][zero[1]];
                    puz[zero[0]+1][zero[1]] = 0;
                }
                break;
            case 2:
                if(zero[0]!=0){
                    puz[zero[0]][zero[1]] = puz[zero[0]-1][zero[1]];
                    puz[zero[0]-1][zero[1]] = 0;
                }
                break;
            case 3:
                if(zero[1]!=2){
                    puz[zero[0]][zero[1]] = puz[zero[0]][zero[1]+1];
                    puz[zero[0]][zero[1]+1] = 0;
                }
                break;
            case 4:
                if(zero[1]!=0){
                    puz[zero[0]][zero[1]] = puz[zero[0]][zero[1]-1];
                    puz[zero[0]][zero[1]-1] = 0;
                }
                break;
        }
    }

    public puzzle move(int i){
        int[] zero = find();
        int aux;
        switch (i){
            case 1:
                if(zero[0]!=2){
                    puz[zero[0]][zero[1]] = puz[zero[0]+1][zero[1]];
                    puz[zero[0]+1][zero[1]] = 0;
                    return this;
                }
                break;
            case 2:
                if(zero[0]!=0){
                    puz[zero[0]][zero[1]] = puz[zero[0]-1][zero[1]];
                    puz[zero[0]-1][zero[1]] = 0;
                    return this;
                }
                break;
            case 3:
                if(zero[1]!=2){
                    puz[zero[0]][zero[1]] = puz[zero[0]][zero[1]+1];
                    puz[zero[0]][zero[1]+1] = 0;
                    return this;
                }
                break;
            case 4:
                if(zero[1]!=0){
                    puz[zero[0]][zero[1]] = puz[zero[0]][zero[1]-1];
                    puz[zero[0]][zero[1]-1] = 0;
                    return this;
                }
                break;
        }
        return this;
    }

    private int[] find(){
        int[] zero = new int[2];
        for(int i = 0; i < puz.length; i++) {
            for (int j = 0; j < puz[i].length; j++)
                if (puz[i][j] == 0) {
                    zero[0]=i;
                    zero[1]=j;
                }
        }
        return zero;
    }

    public boolean validar(){
        int[][] ans = {{1,2,3},{4,5,6},{7,8,0}};
        for(int i = 0; i < puz.length; i++) {
            for (int j = 0; j < puz[i].length; j++)
                if (puz[i][j] != ans[i][j])
                    return true;
        }
        return false;
    }

    public void validar(int z){
        int[][] ans = {{1,2,3},{4,5,6},{7,8,0}};
        for(int i = 0; i < puz.length; i++) {
            for (int j = 0; j < puz[i].length; j++)
                puz[i][j] = ans[i][j];
        }
    }
    @Override
    public String toString() {
        String str="";
        for(int i = 0; i < puz.length; i++) {
            for (int j = 0; j < puz[i].length; j++)
                str += (puz[i][j] + "\t");
            str += "\n";
        }
        return str;
    }
}


package personagem;

public  class atributo {
    
    private int ataque = 2;
    private int stanamina = 8;
    private int vida = 10;
    private int magia = 5;
    private int defesa= 2;
    
    
    //get

    public int getAtaque() {
        return ataque;
    }

    public int getStanamina() {
        return stanamina;
    }

    public int getVida() {
        return vida;
    }

    public int getMagia() {
        return magia;
    }

    public int getDefesa() {
        return defesa;
    }

    
    //set

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setStanamina(int stanamina) {
        this.stanamina = stanamina;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    
    public String atributosmago() {
        return "atributos do mago: " + "\nataque = " + ataque + ", stanamina =" + stanamina + ", vida =" + vida + ", magia =" + magia + ", defesa =" + defesa;
    }

   
    
    
    
    
}

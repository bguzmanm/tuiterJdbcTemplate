package cl.praxis.Tuiter.model.dto;

public class Tuit {
  private int id;
  private String mensaje;

  public Tuit() {
  }

  public Tuit(int id, String mensaje) {
    this.id = id;
    this.mensaje = mensaje;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }
}

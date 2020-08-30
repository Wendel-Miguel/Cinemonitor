public class Filme {
  
  private string _titulo;
  private int _ano;
  private int _tipo;

  public void SetTitulo(string titulo)
  {
    _titulo = titulo;
  }

  public string GetTitulo()
  {
    return _titulo;
  }

  public void SetAno(int ano)
  {
    _ano = ano;
  }

  public int GetAno()
  {
    return _ano;
  }

  public void SetTipo(int tipo)
  {
    _tipo = tipo;
  }

  public int GetTipo()
  {
    return _tipo;
  }

}
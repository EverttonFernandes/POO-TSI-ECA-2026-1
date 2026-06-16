package Aula09TratamentoDeExceções.ExemploPraticoComTryCatch;

public class UsuarioDB {
    private ConexaoDB conexaoDB;

    public void salvarUsuario(Usuario usuario) {
        try {
            conexaoDB.salvar(usuario);
        } catch (Exception e) {
            throw new ConexaoBancoDeDadosException("Erro ao salvar o usuário no banco de dados.");
        } finally {
            System.out.println("Fechando a conexão com o banco de dados.");
        }
    }
}

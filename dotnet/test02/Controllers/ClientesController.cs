using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace MyApp.Namespace
{
    [Route("api/[controller]")]
    [ApiController]
    public class ProdutosController : ControllerBase
    {
        private static readonly List<Produto> produtos = new List<Produtos>
        {
            new Produto { Id = 1, Nome = "Produto A", Categoria = "Categoria 1", Fabricante = "Fabricante X" },
            new Produto { Id = 2, Nome = "Produto B", Categoria = "Categoria 2", Fabricante = "Fabricante Y" },
            new Produto { Id = 3, Nome = "Produto C", Categoria = "Categoria 1", Fabricante = "Fabricante Z" }
        };

        public ActionResult<List<Produto>> Get()
        {
            return Ok(produtos);
        }

        public ActionResult<Produto> Post(Produto produto)
        {
            produto.Id = produtos.Count + 1; // Simula um ID auto-incremental
            produtos.Add(produto);
            return CreatedAtAction(nameof(Get), new { id = produto.Id }, produto);
        }
        public ActionResult<Produto> Put(Produto produto)
        {
            var existeProduto = produtos.FirstOrDefault(p => p.id == produto.id);
            if (existeProduto == null)
            {
                return NotFound();
            }
            existeProduto.nome = produto.nome;
            existeProduto.categoria = produto.categoria;
            existeProduto.fabricante = produto.fabricante;
            return Ok(existeProduto);

        }

        public ActionResult<Produto> Delete(int id)
        {
            var produto = produtos.FirstOrDefault(p => p.Id == id);
            if (produto == null)
            {
                return NotFound();
            }
            produtos.Remove(produto);
            return Ok(produto);
        }
    }

}

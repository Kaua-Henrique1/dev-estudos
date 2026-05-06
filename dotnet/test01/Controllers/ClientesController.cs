using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace MyApp.Namespace
{
    [Route("api/[controller]")]
    [ApiController]
    public class ClientesController : ControllerBase
    {   
        private static readonly List<Cliente> clientes = new List<Cliente>
        {
            new Cliente { Codigo = 1, Nome = "João Silva", Categoria = "A", Fabricante = "Empresa X" },
            new Cliente { Codigo = 2, Nome = "Maria Oliveira", Categoria = "B", Fabricante = "Empresa Y" },
            new Cliente { Codigo = 3, Nome = "Carlos Santos", Categoria = "A", Fabricante = "Empresa Z" }
        };

        // GET: api/Clientes
        [HttpGet]
        public ActionResult<List<Cliente>> Get()
        {
            return Ok(clientes);
        }

        // GET: api/Clientes/5
        [HttpGet("{id}", Name = "Get")]
        public ActionResult<Cliente> Get(int id)
        {
            var cliente = clientes.FirstOrDefault(c => c.Codigo == id);
            if (cliente == null)
            {
                return NotFound();
            }
            return Ok(cliente);
        }

        // POST: api/Clientes
        [HttpPost]
        public ActionResult<Cliente> Post(Cliente cliente)
        {
           cliente.Codigo = clientes.Count + 1; // Simula um código auto-incremental
            clientes.Add(cliente);
            return CreatedAtRoute(nameof(Get), new { id = cliente.Codigo }, cliente);
        }
    }
}
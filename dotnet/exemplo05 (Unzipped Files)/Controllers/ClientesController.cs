using exemplo05.Data;
using exemplo05.Models;
using Microsoft.AspNetCore.Mvc;

namespace exemplo05.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ClientesController : ControllerBase
    {
        private readonly AppDbContext _context;

        public ClientesController(AppDbContext context)
        {
            _context = context;
        }

        // GET: api/Clientes
        [HttpGet("(Id)")]
        public IEnumerable<Cliente> Get()
        {
            return _context.Clientes;
        }
    }
}

using Microsoft.EntityFrameworkCore;
using exemplo05.Models;

namespace exemplo05.Data;

public class AppDbContext : DbContext
{
    public AppDbContext(DbContextOptions<AppDbContext> options) : base(options)
    {
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        base.OnModelCreating(modelBuilder);

        modelBuilder.Entity<Cliente>(entity =>
        {
            entity.HasKey(e => e.Codigo);
            entity.Property(e => e.Nome).IsRequired().HasMaxLength(50);
            entity.Property(e => e.Email).IsRequired().HasMaxLength(50);
        });

        modelBuilder.Entity<Produto>(entity =>
        {
            entity.HasKey(e => e.codigo);
            entity.Property(e => e.nome).IsRequired().HasMaxLength(100);
            entity.Property(e => e.Preco).HasColumnType("decimal(18,2)");
        });

        modelBuilder.Entity<Usuario>(entity =>
        {
            entity.HasKey(e => e.codigo);
            entity.Property(e => e.nome).IsRequired().HasMaxLength(50);
            entity.Property(e => e.email).IsRequired().HasMaxLength(50);
            entity.Property(e => e.senha).IsRequired().HasMaxLength(50);
        });
    }

    public DbSet<Cliente> Clientes { get; set; }
    public DbSet<Produto> Produtos { get; set; }
}

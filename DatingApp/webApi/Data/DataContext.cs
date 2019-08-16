
using Microsoft.EntityFrameworkCore;
using webApi.Data.Model;
namespace webApi.Data
{
    public class DataContext : DbContext
    {
        public  DataContext(DbContextOptions<DataContext>options) :base(options)
        {
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder){
            base.OnModelCreating(modelBuilder);
            modelBuilder.Entity<User>().ToTable("Users");
            modelBuilder.Entity<Setting>().ToTable("Settings");
            modelBuilder.Entity<Message>().ToTable("Messages");

        }
        public DbSet<User> Users{get;set;}
        public DbSet<Setting> Settings{get;set;}
        public DbSet<Message> Messages{get;set;}
    }
}
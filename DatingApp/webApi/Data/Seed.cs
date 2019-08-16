using System;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using Newtonsoft.Json;
using webApi.Data.Model;

namespace webApi.Data
{
    public class Seed
    {
        private readonly DataContext _context;
        public Seed(DataContext context)
        {
            _context = context;
           
        }

        public async Task seedUser()
        {
            var userData = System.IO.File.ReadAllText("C:/Incubator/DatingApp/webApi/Data/FlatFile.Json");
            var Clients = JsonConvert.DeserializeObject<User[]>(userData);
            if(!  (await _context.Users.CountAsync() > 0))
            {
                 foreach(User user  in Clients)
            {
                _context.Add(user);
            }
           
           await  _context.SaveChangesAsync();  
            }
           
        }

        private class DateTime
        {
        }
    }
}
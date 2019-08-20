using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using webApi.Data;
using webApi.Data.Model;
using webApi.DTO;

namespace DatingApp.Controllers
{

    [Route("api/[controller]")]
    [ApiController]
    public class ValuesController : ControllerBase
    {
        private readonly DataContext _context;
        public ValuesController(DataContext context)
        {
            _context = context;

        }

    


    // GET api/values
       /*  [HttpGet]
        public ActionResult<IEnumerable<string>> Get()
        {
            var users = _context.Users;
            return Ok(users);
        }
*/
        // GET api/values
         [HttpGet("{id}")]
        public ActionResult<string> Get(int id)
        {
            var users = _context.Users.Where((user)=> user.Id == id ).FirstOrDefault();
            return Ok(users);
        }

         [HttpGet("femaleGender")]
         public IActionResult Get()
        {
            var users = _context.Users.Where((user)=> user.Gender == "female").ToList();
            return Ok(users);
        }

          [HttpGet("maleGender")]
         public IActionResult Get(string male)
        {
            var users = _context.Users.Where((user)=> user.Gender == "male").ToArray();
            return Ok(users);
        }

         [HttpGet("pass")]
         public IActionResult Get(UserModel model )
        {
            string username = model.UserName;
            string password = model.Password;
            var users = _context.Users.Where((user)=> (user.UserName == username & user.Password == password)).FirstOrDefault();
            return Ok(users);
        }


        // POST api/values
        [HttpPost]
        public  IActionResult Post(User user1)
        {
            _context.Add(user1);
            _context.SaveChangesAsync(); 

            return Ok("done");
        }

        // PUT api/values/5
        [HttpPut]
        public  IActionResult Put(User used)
        {
             User user = _context.Users.Where((User)=>User.Id== used.Id).FirstOrDefault();
             user.FirstName = used.FirstName;
             user.LastName = used.LastName;
             user.DateOfBirth = used.DateOfBirth;
             user.Email = used.Email;
             user.Gender = used.Gender;
             user.Password = used.Password;
             user.UserName = used.UserName;
            _context.Update(user);
             _context.SaveChanges();
             return Ok("Done");
        } 

        // DELETE api/values/5
        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            User user = _context.Users.Where((User)=>User.Id== id).FirstOrDefault();
          _context.Remove(user);
             _context.SaveChanges();
             return NoContent();
        }
    }
}

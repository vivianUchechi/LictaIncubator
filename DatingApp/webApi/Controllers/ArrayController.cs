using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using webApi.Microservice;
using webApi.DTO;
namespace DatingApp.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ArrayController : ControllerBase
    {
        private int[] myArray;

        // POST api/values
        [HttpPost]
        public  IActionResult Post(ArrayModel arrayModel)
        {
            
            myArray = arrayModel.MyArray;
            Array.Sort(myArray);
               return Ok(myArray);
            
        }

        [HttpGet]
        public ActionResult<IEnumerable<int>> Get()
        {
            
            return myArray;
        }
         
    }
}
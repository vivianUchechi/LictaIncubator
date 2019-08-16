using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using webApi.Microservice;
using webApi.DTO;
namespace DatingApp.Controllers
{  [Route("api/[controller]")]
    [ApiController]

    public class SentenceController : ControllerBase
   
    { 
        private string first;
        private string second;
        private string third;
        private string fourth;

        CountSpace countIt = new CountSpace();
          [HttpPost]
        public IActionResult Post(Sentence sentence)
        {
            string[] sent = sentence.sentences;
           
            int[] finalCount = new int[sent.Length];
             for(int i= 0; i < finalCount.Length; i++)
            {
                finalCount[i] = countIt.counter(sent[i]);
            }

            


        return Ok(finalCount);

         }
    }
}

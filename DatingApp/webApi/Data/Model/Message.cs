using System;
namespace webApi.Data.Model
{
    public class Message
    {
        public int id {get; set;}
        public string content {get; set;}
        public DateTime TimeSent {get; set;}
        public DateTime TimeReceived {get; set;}

    }
}
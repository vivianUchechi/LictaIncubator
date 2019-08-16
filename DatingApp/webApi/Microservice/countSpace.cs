namespace webApi.Microservice
{
    public class CountSpace
    {
        public int counter (string input)
        {
            input.Trim();
            char[]characters = input.ToCharArray();
            int count = 1;
            foreach(char character in characters)
            {
                
                if(character.Equals(' '))
                {
                        count++ ;
                }

        }
        return count;
    }
}
}
 try
    {
      File f = new File("Output.txt");
      FileOutputStream fos = new FileOutputStream(f);
      PrintWriter pw = new PrintWriter(fos);

      int[]arr = {54,63,14,6,21,5,94,2};
      Arrays.sort(arr);
      String s = "";

      for(int i = 0; i < arr.length; i++)
      {
        s = s + arr[i] + ",";
      }
    
      pw.write(s);
      pw.flush();
      fos.close();
      pw.close();	
      System.out.println("Output Written to file");
    }
    
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
    
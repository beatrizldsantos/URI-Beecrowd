main :: IO ()
main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int
    let soma = a + b
    putStrLn $ "SOMA = " ++ show soma

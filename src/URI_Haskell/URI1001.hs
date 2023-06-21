main :: IO ()
main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int
    let x = a + b
    putStrLn ("X = " ++ show x)

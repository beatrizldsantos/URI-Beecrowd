-- resolução uri 1241 haskell
verifica:: String -> String -> String
verifica a b
    | length a < length b = "nao encaixa"
    | length a == length b && a == b = "encaixa"
    | length a == length b && a /= b = "nao encaixa"
    | otherwise = verifica (tail a) b
main :: IO()
main = do
    n <- readLn :: IO Int
    lista <- getContents
    let linhas = lines lista
    let saida = map words linhas
    let a = map (!!0) saida
    let b = map (!!1) saida
    let resultado = map (uncurry verifica) (zip a b)
    mapM_ putStrLn resultado

import Image from "next/image";
import Link from "next/link";
import ComponentPage from "../_components/page";

export const metadata = {
  title: 'Home'
}

export default async function Home({searchParams, params}) {
  console.log(await searchParams);
  console.log(await params);
  return (
    <>
    <h1>Welcome to my home.</h1>
    <ComponentPage />
    <p>
    <Link href='/about'>About</Link>
    </p>
    <p>
    <Link href='/services'>service</Link>
    </p>
    <p>
    <Link href='/files'>Files</Link>
    </p>
    </>
  );
}
